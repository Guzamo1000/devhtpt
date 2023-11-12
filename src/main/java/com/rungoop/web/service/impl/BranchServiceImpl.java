package com.rungoop.web.service.impl;

import com.rungoop.web.entity.Branch;
import com.rungoop.web.reponsitory.BranchRepository;
import com.rungoop.web.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchRepository branchRepository;



    @Override
    public List<Branch> getAllBranch() {
        return branchRepository.findAll();
    }

    @Override
    public Branch saveBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public Optional<Branch> getBranchById(Long id) {
        return branchRepository.findById(id);
    }

    @Override
    public Branch updateBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public void deleteBranch(long id) {
        branchRepository.deleteById(id);
    }
}
