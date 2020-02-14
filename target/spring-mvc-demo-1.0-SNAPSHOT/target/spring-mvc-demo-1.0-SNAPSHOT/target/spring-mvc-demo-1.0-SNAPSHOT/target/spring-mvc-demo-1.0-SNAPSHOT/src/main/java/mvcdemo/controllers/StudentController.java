package mvcdemo.controllers;

import mvcdemo.dao.StudentDao;
import mvcdemo.model.Student;
import mvcdemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/student")
public class StudentController {

    @InitBinder //pre-processing all requests before they reaches the controller
    public void initBinder(WebDataBinder webDataBinder){
        //removes leading and trailing white-spaces
        // + turns string to null, if it is completely white-space
        StringTrimmerEditor stringTrimmerEditor =
                new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @Autowired
    StudentService studentService;

//unused values
//    @Value("#{countryOptions}")
//    public Map<String,String> theCountryOptions;
//
//    @Value("#{progLangOptions}")
//    public Map<String,String> programmingLanguages;
//
//    @Value("#{operSystems}")
//    public Map<String,String> operatingSystems;

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/saveStudent")
    public String processForm(@Valid @ModelAttribute("student") Student student
            , BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "student-form";
        }
        else {
            return "student-confirm";
        }
    }
    @GetMapping ("/list")
    public String listOfStudents(Model model){
        List<Student> list = studentService.getStudentList();
        model.addAttribute("students", list);
        return "list-students";
    }
}
