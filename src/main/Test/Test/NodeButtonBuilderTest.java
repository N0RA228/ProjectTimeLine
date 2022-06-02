package Test;

import ProjectTimeLine.TimeLine.Node;
import ProjectTimeLine.TimeLine.UINode;
import UI.NodeButtonBuilder;
import javafx.scene.control.Button;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeButtonBuilderTest {

    @Test
    void createTestNullUINode() {

        Node node = new Node();
        NodeButtonBuilder nodeButtonBuilder = new NodeButtonBuilder(node);
        Button button = nodeButtonBuilder.create();
        Assert.assertEquals(node.uiNode.radius, 100, 0.01);
    }

    @Test
    void createTestNotNullUINode() {

        Node node = new Node();
        node.uiNode = new UINode();
        node.uiNode.radius = 150;
        NodeButtonBuilder nodeButtonBuilder = new NodeButtonBuilder(node);
        Button button = nodeButtonBuilder.create();
        Assert.assertEquals(node.uiNode.radius, 150, 0.01);
    }
}