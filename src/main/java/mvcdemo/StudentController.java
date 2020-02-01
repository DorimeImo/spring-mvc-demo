package mvcdemo;

import mvcdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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

    @Value("#{countryOptions}")
    public Map<String,String> theCountryOptions;

    @Value("#{progLangOptions}")
    public Map<String,String> programmingLanguages;

    @Value("#{operSystems}")
    public Map<String,String> operatingSystems;

    @RequestMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("student", new Student());
        model.addAttribute("theCountryOptions", theCountryOptions);
        model.addAttribute("theProgrammingLanguages", programmingLanguages);
        model.addAttribute("theOperatingSystems", operatingSystems);
        return "student-form";
    }

    @RequestMapping ("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student
            , BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("theCountryOptions", theCountryOptions);
            model.addAttribute("theProgrammingLanguages", programmingLanguages);
            model.addAttribute("theOperatingSystems", operatingSystems);
            return "student-form";
        }
        else {
            return "student-confirm";
        }
    }
}
