package kodlamaio.devs.languageProgramming.dataAcces.concretes;

import kodlamaio.devs.languageProgramming.dataAcces.abstracts.ProgrammingLanguageRepository;
import kodlamaio.devs.languageProgramming.entities.ProgrammingLanguages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryProgrammingLanguages implements ProgrammingLanguageRepository {

    List<ProgrammingLanguages> languages;

    public InMemoryProgrammingLanguages() {
        languages = new ArrayList<>();
        languages.add(new ProgrammingLanguages(1,"Java"));
        languages.add(new ProgrammingLanguages(2,"C#"));
        languages.add(new ProgrammingLanguages(1,"Phyton"));

    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return languages;
    }


    @Override
    public void add(ProgrammingLanguages programmingLanguages) {
        languages.add(programmingLanguages);
    }

    @Override
    public ProgrammingLanguages getByid(int id) throws Exception {
        for (ProgrammingLanguages languages1: languages){
            if (languages1.getId()== id){
                return languages1 ;
            }
        }
        throw new Exception("kayit bulunamadi");
    }

    @Override
    public void update(int id, ProgrammingLanguages programmingLanguages) throws Exception {
        ProgrammingLanguages programmingLanguages1 = getByid(id);
        programmingLanguages1.setName(programmingLanguages.getName());
    }

    @Override
    public void delete(int id) throws Exception {
        languages.remove(getByid(id));
    }
}
