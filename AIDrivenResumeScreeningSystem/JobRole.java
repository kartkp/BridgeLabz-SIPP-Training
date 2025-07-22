package AIDrivenResumeScreeningSystem;

abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleName() { return roleName; }
}

