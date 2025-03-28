package com.organizationmanagment.demo.repository;

import com.organizationmanagment.demo.model.OrganizationManagment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrganizationManagmentRepo extends JpaRepository<OrganizationManagment, Long> {
    List<OrganizationManagment> findByParentOrganizationId(Long parentId);
}
