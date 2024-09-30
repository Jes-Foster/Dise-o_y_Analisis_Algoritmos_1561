
package com.mycompany.jes.t6;






class Arbol {
    private Node root;

    public Arbol() {
        this.root = null;
    }

    
    public void insert(int key, Alumno value) {
        if (root == null) {
            root = new Node(key, value);
        } else {
            insert(root, key, value);
        }
    }

    private void insert(Node node, int key, Alumno value) {
        if (key < node.getKey()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(key, value));
            } else {
                insert(node.getLeft(), key, value);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node(key, value));
            } else {
                insert(node.getRight(), key, value);
            }
        }
    }

   public Alumno search(int key) {
        return search(root, key);
    }

    private Alumno search(Node node, int key) {
        if (node == null || node.getKey() == key) {
            return node == null ? null : node.getValue();
        }
        if (key < node.getKey()) {
            return search(node.getLeft(), key);
        }
        return search(node.getRight(), key);
    }



public void recorrerABB() {
        recorrerABB(root);
    }

    private void recorrerABB(Node node) {
        if (node != null) {
            recorrerABB(node.left);
            
            System.out.println("\n");
            System.out.println("************");
            System.out.println("Numero de cuenta: " + node.value.getNumeroCuenta());
            System.out.println("Nombre completo: " + node.value.getNombre());
            System.out.println("Materias: " + String.join(", ", node.value.getMaterias()));
            System.out.println("Promedio general: " + String.format("%.1f", node.value.getPromedio()));
            recorrerABB(node.right);
        }
    }

}