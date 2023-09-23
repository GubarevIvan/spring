package hiber.dao;

import hiber.model.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().persist(user);
   }

   @Override
   public List<User> listUsers() {
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User", User.class);
      return query.getResultList();
   }

   @Override
   public void addUserCar(User user, Car car) {
      sessionFactory.getCurrentSession().save(user);
      sessionFactory.getCurrentSession().save(car);
   }

   @Override
   public User getCarToUser(String model, int series) {
      String hql = "select user from  User user where  user.car.model = :param1 and user.car.series = :param2";
         TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery(hql, User.class);
         query.setParameter("param1", model);
         query.setParameter("param2", series);

      return query.getSingleResult();
   }
}