package ProjectTimeLine.TimeLine;

import java.util.ArrayList;
import java.util.List;

/** Содержит информацию о ноде */
public class Node {

    public String name;
    public String description;

    /** Содержит информацию о графическом представлении нода */
    public UINode uiNode;

    /** Хранит ссылки на дочерние ноды */
    public List<Node> childNodes;

    /** Конструктор инициализации нода
     * Инициализирует массив дочерних элементов*/
    public Node () {
        name = "none";
        description = "";
        childNodes = new ArrayList<Node>();
    }
}
