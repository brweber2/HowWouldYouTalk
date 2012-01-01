package pkg;

public enum DollType
{
    A("Supplier","Us"      ,"Russian doll"),
    B("Supplier","Us"      ,"Solid doll"),
    C("Supplier","Customer","Russian doll"),
    D("Supplier","Customer","Solid doll"),
    E("Us"      ,"Customer","Russian doll"),
    F("Us"      ,"Customer","Solid doll"),
    G("Customer","Customer","Russian doll"),
    H("Customer","Customer","Solid doll");

    private String from;
    private String to;
    private String which;

    private DollType( String from, String to, String which )
    {
        this.from = from;
        this.to = to;
        this.which = which;
    }

    public String getFrom()
    {
        return from;
    }

    public String getTo()
    {
        return to;
    }

    public String getWhich()
    {
        return which;
    }
}
