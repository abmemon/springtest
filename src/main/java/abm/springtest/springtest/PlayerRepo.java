package abm.springtest.springtest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerRepo implements IRepository<Player> {

    private Map<Integer, Player> data;
    public PlayerRepo(){
        this.data=new HashMap<>();
    }
    
    @Override
    public void save(Player p) {
        this.data.put(p.getId(), p);
    }

    @Override
    public Collection<Player> getAll() {
        return this.data.values();
    }

    public Collection<Player> get(int id) {
        return this.data.values().stream().filter(f -> f.getId() == id ).collect(Collectors.toList());
        //return this.data.values().stream().filter(f -> f.getId() == id ).findFirst().orElse(null);
    }

    public String update(int id, Player p) {

        if (this.data.containsKey(id)) {
            Player player = data.get(id);

            if(p.getName() != null && !p.getName().isEmpty() && player.getName() != p.getName()){
                player.setName(p.getName());
            }

            if(p.getCountry() != null && !p.getCountry().isEmpty() && player.getCountry() != p.getCountry()){
                player.setCountry(p.getCountry());
            }

            if(p.getAvg() != 0 &&   player.getAvg() != p.getAvg()){
                player.setAvg(p.getAvg());
            }

            if(p.getMom() != 0 &&  player.getMom() != p.getMom()){
                player.setMom(p.getMom());
            }

            return "Player with ID " + id + " is updated.";
        }
        else {
            return "Player with ID " + id + " not found.";
        }
    }

    public String delete(Integer id){
        
        if(this.data.containsKey(id)){
            data.remove(id);
            return "Player with ID " + id + " is removed.";
        }
        else{
            return "Player with ID " + id + " not found.";
        }
    }



    
}
