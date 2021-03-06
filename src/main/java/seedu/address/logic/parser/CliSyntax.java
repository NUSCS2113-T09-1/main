package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_MACHINE_STATUS = new Prefix("ms/");
    public static final Prefix PREFIX_MACHINE_JOBS = new Prefix("j/");
    public static final Prefix PREFIX_MACHINE = new Prefix("m/");
    public static final Prefix PREFIX_JOB_OWNER = new Prefix("on/");
    public static final Prefix PREFIX_JOB_PRIORITY = new Prefix("pr/");
    public static final Prefix PREFIX_JOB_NOTE = new Prefix("jn/");
    public static final Prefix PREFIX_JOB_DURATION =  new Prefix("d/");
}
