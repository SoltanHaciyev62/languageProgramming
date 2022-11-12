package kodlamaio.devs.languageProgramming.dataAcces.abstracts;

import kodlamaio.devs.languageProgramming.entities.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguageRepository {

    List<ProgrammingLanguages> getAll();
    void add(ProgrammingLanguages programmingLanguages);
    void  delete( int id) throws Exception;
    ProgrammingLanguages getByid(int id) throws Exception;
    void update(int id, ProgrammingLanguages programmingLanguages) throws  Exception;
}
