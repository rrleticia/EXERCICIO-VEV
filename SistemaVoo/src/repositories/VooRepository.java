package repositories;

import models.Voo;

import java.util.ArrayList;
import java.util.UUID;

public class VooRepository {

    private ArrayList<Voo> voos;

    public VooRepository(ArrayList<Voo> voos) {
        this.voos = voos;
    }

    public int getTotalVoosCadastrados() {
        return this.voos.size();
    }

    public void adicionarVoo(Voo voo) {
        this.voos.add(voo);
    }

    public void removerVoo(Voo voo) {
        this.voos.remove(voo);
    }

    public void removerVooPorId(UUID vooId) {
        this.voos.removeIf(voo -> voo.getID().equals(vooId));
    }

}
