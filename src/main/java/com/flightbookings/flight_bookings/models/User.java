package com.flightbookings.flight_bookings.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "User")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private ERole role;





    public User(Long id, ERole role, String password, String email, String username) {
        this.id = id;
        //this.projectsList = projectsList;
        //this.tasks = tasks;
        this.role = role;
        this.password = password;
        this.email = email;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ERole getRole() {
        return role;
    }

    public void setRole(ERole role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String username;
        private String email;
        private String password;
        private ERole role;
        //private List<> ;
        //private List<> ;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder role(ERole role) {
            this.role = role;
            return this;
        }

//        public Builder tasks(List<Task> tasks) {
//            this.tasks = tasks;
//            return this;
//        }
//
//        public Builder projectsList(List<Project> projectsList) {
//            this.projectsList = projectsList;
//            return this;
//        }
//
//        public User build() {
//            return new User(id, projectsList, tasks, role, password, email, username);
//
//        }
    }
}
