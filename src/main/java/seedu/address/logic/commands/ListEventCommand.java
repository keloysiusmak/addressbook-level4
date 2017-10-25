package seedu.address.logic.commands;

import static seedu.address.model.Model.PREDICATE_SHOW_ALL_EVENTS;

/**
 * Lists all events in the event book to the user.
 */
public class ListEventCommand extends Command {
    public static final String COMMAND_WORD = "listevent";

    public static final String MESSAGE_SUCCESS = "Listed all events";


    @Override
    public CommandResult execute() {
        model.updateFilteredEventList(PREDICATE_SHOW_ALL_EVENTS);
        return new CommandResult(MESSAGE_SUCCESS);
    }

    public static String getCommandWord() {
        return COMMAND_WORD;
    }
}
