/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DFS;

/**
 *
 * @author rai
 */
public class vertex {
    private String label;
    private boolean flagVisited;

    public vertex(String label) {
    this.label=label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
}
