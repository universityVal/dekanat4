package sk.pro.dekanat.service.faculty.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.pro.dekanat.model.Faculty;
import sk.pro.dekanat.repository.FacultyRepository;
import sk.pro.dekanat.service.faculty.intrfaces.IFacultyService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class FacultyServiceImpl  {

    @Autowired
    FacultyRepository repository;

    private List<Faculty> faculties = new ArrayList<>();
    {
        faculties.add(new Faculty(1,"EI"));
        faculties.add(new Faculty(2,"KN"));
        faculties.add(new Faculty(3,"EK"));
        faculties.add(new Faculty(4,"IT"));
        faculties.add(new Faculty(5,"IFKTN"));
       // repository.saveAll(faculties);
    }
    @PostConstruct
    void init(){
        System.out.println("begin");
       // repository.saveAll(faculties);

        System.out.println(repository.findAll().size());
        System.out.println("End");

    }



    public List<Faculty> getAll() {
        return repository.findAll();
    }
}
