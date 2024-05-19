package Get;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class BasicController {

    @RequestMapping(method = RequestMethod.GET, path = "/ciao/{provincia}")
    public User ciao(
            @PathVariable String provincia,
            @RequestParam String nome) {
        return new User(nome, provincia, "Ciao " + nome + " , com'è il tempo in " + provincia + "?");
    }
}
