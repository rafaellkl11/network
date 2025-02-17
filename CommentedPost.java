import java.util.ArrayList;
/**
 * Escreva uma descrição da classe CommentedPost aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CommentedPost extends Post
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int likes;
    private ArrayList<String> comments;

    /**
     * Construtor para objetos da classe CommentedPost
     */
    public CommentedPost(String author)
    {
        // inicializa variáveis de instância
        super(author);
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        likes++;
    }

    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }
    
    public void display(){
        if(likes > 0) {
            System.out.println("  -  " + likes + " people like this.");
        }
        else {
            System.out.println();
        }
        
        if(comments.isEmpty()) {
            System.out.println("   No comments.");
        }
        else {
            System.out.println("   " + comments.size() + " comment(s). Click here to view.");
        }
    }

    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
}
