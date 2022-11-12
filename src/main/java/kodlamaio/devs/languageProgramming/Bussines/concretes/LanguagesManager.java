package kodlamaio.devs.languageProgramming.Bussines.concretes;

import kodlamaio.devs.languageProgramming.Bussines.abstracts.LanguageService;
import kodlamaio.devs.languageProgramming.dataAcces.abstracts.ProgrammingLanguageRepository;
import kodlamaio.devs.languageProgramming.entities.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguagesManager implements LanguageService {


    private ProgrammingLanguageRepository languageRepository;

    @Autowired
    public LanguagesManager(ProgrammingLanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return this.languageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguages programmingLanguages) throws Exception {
        if (programmingLanguages.getName().isEmpty()) {
            throw new Exception("Programlama ismi bos olamaz");
        }
          if (isName(programmingLanguages)) throw new Exception("Ad eyni ola bilmez");
        languageRepository.add(programmingLanguages);
    }

    @Override
    public void delete(int id) throws Exception {
        languageRepository.delete(id);
    }

    @Override
    public ProgrammingLanguages getById(int id) throws Exception {
        return languageRepository.getByid(id);
    }

    @Override
    public void update(int id, ProgrammingLanguages programmingLanguages) throws Exception{
     if (isName(programmingLanguages)) throw  new Exception("Ad  eyni ola bilmez");
     languageRepository.update(id, programmingLanguages);
    }

    public boolean isName(ProgrammingLanguages programmingLanguages) {
        for (ProgrammingLanguages mylanguage : getAll()) {
            if (mylanguage.getName().equals(programmingLanguages.getName())) {
                return true;

            }
        }
        return false;
    }
}
