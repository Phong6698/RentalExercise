package model;

/*
 * For JComboBoxes
 */
public class Item {
	private int id;
    private String description;

    /**
     * Konstruktor fuer Item
     * @param id
     * @param description
     */
    public Item(int id, String description)
    {
        this.id = id;
        this.description = description;
    }

    // Setter & Getter
    public int getId()
    {
        return id;
    }

    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return description;
    }
}
