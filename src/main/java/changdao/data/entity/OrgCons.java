package changdao.data.entity;

import java.util.List;

/**
 * 外部组织机构
 */
public class OrgCons {
    /**
     * 组织机构id
     */
    private String deptId;
    /**
     * 组织机构名称
     */
    private String deptName;
    /**
     * 父级组织机构id
     */
    private String parentDeptId;
    /**
     * 子节点
     */
    private List<OrgCons> children;
    /**
     * 类型
     */
    private String type;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getParentDeptId() {
        return parentDeptId;
    }

    public void setParentDeptId(String parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    public List<OrgCons> getChildren() {
        return children;
    }

    public void setChildren(List<OrgCons> children) {
        this.children = children;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
