package abm.springtest.springtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/player")

public class PlayerController {
    PlayerRepo repo;

    public PlayerController(){
        repo = new PlayerRepo();
    }


    @GetMapping("/all")
    public Collection<Player> getAllPlayers() {
        return repo.getAll();
    }

    @GetMapping("/{id}")
    public Collection<Player> getPlayer(@PathVariable("id") int id) {
        return repo.get(id);
    }

    @PostMapping("/save")
    public String createPlayer(@RequestBody Player p) {
        repo.save(p);
        return "Player Saved";
    }
    
    @PostMapping("/update/{id}")
    public String updatePlayer(@PathVariable("id") int id, @RequestBody Player p) {
        return repo.update(id,p);
    }

    @PostMapping("/delete/{id}")
    public String deletePlayer(@PathVariable("id") int id) {
        return repo.delete(id);
    }
}
