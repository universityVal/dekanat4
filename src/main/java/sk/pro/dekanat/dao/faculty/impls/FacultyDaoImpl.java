package sk.pro.dekanat.dao.faculty.impls;

import org.springframework.stereotype.Repository;
import sk.pro.dekanat.dao.faculty.interfaces.IFacultyDao;
import sk.pro.dekanat.model.Faculty;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FacultyDaoImpl implements IFacultyDao {

    private List<Faculty> faculties = new ArrayList<>();
    {
        faculties.add(new Faculty(1,"EI"));
        faculties.add(new Faculty(2,"KN"));
        faculties.add(new Faculty(3,"EK"));
        faculties.add(new Faculty(4,"IT"));
        faculties.add(new Faculty(5,"IFKTN"));
    }

    @Override
    public Faculty create(Faculty faculty) {
        return null;
    }

    @Override
    public Faculty get(int id) {
        return null;
    }

    @Override
    public Faculty update(Faculty faculty) {
        return null;
    }

    @Override
    public Faculty delete(int id) {
        return null;
    }

    @Override
    public List<Faculty> getAll() {
        return this.faculties;
    }
}
