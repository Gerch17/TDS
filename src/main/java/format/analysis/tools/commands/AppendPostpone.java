package format.analysis.tools.commands;

import format.analysis.tools.IContext;

public class AppendPostpone implements ICommand {
    @Override
    public void execute(char ch, IContext context) {
        context.appendPostpone(ch);
    }
}
