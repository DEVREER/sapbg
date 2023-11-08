package com.sapbg.app.service;

import com.sapbg.app.model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserService {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("YourPersistenceUnitName");

    public void createUser(UserEntity user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<UserEntity> getAllUsers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<UserEntity> users = entityManager.createQuery("SELECT u FROM UserEntity u", UserEntity.class).getResultList();
        entityManager.close();
        return users;
    }

    public UserEntity getUserById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        UserEntity user = entityManager.find(UserEntity.class, id);
        entityManager.close();
        return user;
    }

    public void updateUser(UserEntity user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void deleteUser(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        UserEntity user = entityManager.find(UserEntity.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
