package ej22;

public abstract class ProcessStep {
    private boolean result;

    public void execute(MixingTank tank) {
        if (this.basicExecute(tank)){
            this.setSuccess();
        }
        else this.setFailure();
    }

    protected abstract boolean basicExecute(MixingTank tank);

    public boolean isDone(){
        return true;
    }

    private void setSuccess() {
        this.result = true;
    }

    private void setFailure() {
        this.result = false;
    }
}
