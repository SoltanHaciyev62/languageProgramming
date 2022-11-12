package kodlamaio.devs.languageProgramming.Bussines.abstracts;

import kodlamaio.devs.languageProgramming.entities.ProgrammingLanguages;

import java.util.List;

public interface LanguageService {
List<ProgrammingLanguages> getAll();
void  add(ProgrammingLanguages programmingLanguages) throws Exception;
void delete(int id) throws Exception;
ProgrammingLanguages getById(int id) throws Exception;
void update(int id, ProgrammingLanguages programmingLanguages) throws  Exception;
}
