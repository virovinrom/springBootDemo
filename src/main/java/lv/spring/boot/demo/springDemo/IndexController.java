package lv.spring.boot.demo.springDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    final VisitsRepository visitsRepository;

    public IndexController(VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("name", "Slava");
        model.put("name2", "Slava2");

        Visit visit = new Visit();
        visit.description = String.format("visited at %s", LocalDateTime.now());
        visitsRepository.save(visit);
        return new ModelAndView("index", model);
    }
}
