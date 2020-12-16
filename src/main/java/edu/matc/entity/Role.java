package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * This class is a role entity
 *
 * @author jtschissel
 * @version 1.0
 */

@Entity(name = "Role")
@Table(name = "user_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id",
                foreignKey = @ForeignKey(name = "FK_UserRole"))
    private User user;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "username")
    private String username;


    public Role() {
    }

    public Role(User user, String roleName, String username) {
        this.user = user;
        this.roleName = roleName;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}