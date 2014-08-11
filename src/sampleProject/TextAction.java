package sampleProject;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class TextAction extends AnAction{

    public TextAction(){
        super("Text_try_plugin");
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getProject();
        String txt = Messages.showInputDialog(project, "WHats your name", "Input your name", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello" + txt, "Information", Messages.getInformationIcon());
    }
}