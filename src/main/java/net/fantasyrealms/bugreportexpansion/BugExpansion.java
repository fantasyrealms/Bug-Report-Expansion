package net.fantasyrealms.bugreportexpansion;

import com.leon.bugreport.API.BugReportExpansion;
import org.bukkit.entity.Player;

import java.util.List;

public class BugExpansion extends BugReportExpansion {

    @Override
    public String identifier() {
        return "example";
    }

    @Override
    public List<String> additionalDetails(Player player) {
        return List.of("Flying: " + player.isFlying(), "Exp: " + player.getExp());
    }

}
