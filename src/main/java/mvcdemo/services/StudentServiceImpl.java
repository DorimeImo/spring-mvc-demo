package mvcdemo.services;

import mvcdemo.dao.StudentDao;
import mvcdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    @Transactional
    public List<Student> getStudentList(){
        List<Student> list = studentDao.getStudentList();
        return list;
    }
}
