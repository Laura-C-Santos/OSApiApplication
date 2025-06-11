/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.laura.OSApiApplication.domain.service;

import java.time.LocalDateTime;
import local.laura.OSApiApplication.domain.model.OrdemServico;
import local.laura.OSApiApplication.domain.model.StatusOrdemServico;
import local.laura.OSApiApplication.domain.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjatb
 */
@Service
public class OrdemServicoService {
        @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    public OrdemServico criar(OrdemServico ordemServico){
       ordemServico.setStatus(StatusOrdemServico.ABERTA);
       ordemServico.setDataAbertura(LocalDateTime.now());

       return ordemServicoRepository.save(ordemServico);
    }
    
}
