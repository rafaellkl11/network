
/**
 * Escreva uma descrição da classe EventPost aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class EventPost extends Post
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String eventType;

    /**
     * Construtor para objetos da classe EventPost
     */
    public EventPost(String author, String evento)
    {
        // inicializa variáveis de instância
        super(author);
        eventType = evento;
    }

    public String getEvent()
    {
        return eventType;        
    }
}
