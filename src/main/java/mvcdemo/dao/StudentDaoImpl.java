package mvcdemo.dao;

import mvcdemo.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Student> getStudentList() {
        Session session = sessionFactory.getCurrentSession();
        Query <Student> query = session.createQuery("from Student", Student.class);
        List<Student> students =  query.getResultList();
        return students;
    }
}
