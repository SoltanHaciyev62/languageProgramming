package kodlamaio.devs.languageProgramming.WebApiControllers;

import kodlamaio.devs.languageProgramming.Bussines.abstracts.LanguageService;
import kodlamaio.devs.languageProgramming.entities.ProgrammingLanguages;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {
    private LanguageService languageService;

    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<ProgrammingLanguages> getAll() {
        return this.languageService.getAll();
    }

    @GetMapping("/{id}")
    ProgrammingLanguages getById(@PathVariable int id) throws Exception {
        return languageService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, ProgrammingLanguages programmingLanguages) throws Exception {
        languageService.update(id, programmingLanguages);
    }

    @PostMapping("/add")
    public void add(@RequestBody() ProgrammingLanguages programmingLanguages) throws Exception {
        languageService.add(programmingLanguages);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) throws Exception {
        languageService.delete(id);
    }

}
