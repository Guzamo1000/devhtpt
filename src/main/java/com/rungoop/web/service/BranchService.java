package com.rungoop.web.service;

import com.rungoop.web.entity.Branch;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
@Service
public interface BranchService {
    List<Branch> getAllBranch();

    Branch saveBranch(Branch branch);

    Optional<Branch> getBranchById(Long id);

    Branch updateBranch(Branch branch);

    void deleteBranch(long id);

}
