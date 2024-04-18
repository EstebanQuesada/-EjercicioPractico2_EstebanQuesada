package Hoteles.demo.service;

import Hoteles.demo.domain.Usuario;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TypedQuery<Usuario> query = entityManager.createQuery(
            "SELECT u FROM Usuario u WHERE u.username = :username", Usuario.class);
        query.setParameter("username", username);
        Usuario usuario = query.getResultList().stream().findFirst().orElse(null);

        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
        }

        return new User(
            usuario.getUsername(),
            usuario.getPassword(),
            true, true, true, true,
            Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))); // Ajustar según los roles
    }
}