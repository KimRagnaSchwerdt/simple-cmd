package cmd.commands;

import cmd.commands.copy.CopyCommand;
import cmd.commands.del.DelCommand;
import cmd.commands.dir.DirCommand;
import cmd.commands.move.MoveCommand;
import cmd.commands.rename.RenameCommand;
import cmd.commands.time.TimeCommand;
import picocli.CommandLine.Command;

/**
 * this is the basic Commmand object used to register all other Commands via subcommands parameter in @Command annotation
 */
@Command(
        name = "cmd",
        description = "base command",
        mixinStandardHelpOptions = true,
        subcommands = {DirCommand.class, DelCommand.class, CopyCommand.class, TimeCommand.class, RenameCommand.class, MoveCommand.class})
public class BaseCommand implements Runnable {
    public BaseCommand() {
    }

    @Override
    public void run() {
        // nothing to do here
    }

}
