package ej22;

public abstract class ProcessStep {
    private boolean result;

    public void execute(MixingTank tank) throws InterruptedException {
        if (this.basicExecute(tank)){
            this.setSuccess();
        }
        else this.setFailure();
    }

    protected abstract boolean basicExecute(MixingTank tank) throws InterruptedException;

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
