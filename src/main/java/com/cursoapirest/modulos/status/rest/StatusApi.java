package com.cursoapirest.modulos.status.rest;

import com.cursoapirest.modulos.status.dto.StatusDTO;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

public interface StatusApi {
  @ApiResponses(
    {
      @ApiResponse(code = 200, message = "Ok Api funcionando"),
      @ApiResponse(code = 404, message = "Não encontrou a Api"),
      @ApiResponse(code = 401, message = "Não tem permissão"),
    }
  )
  ResponseEntity<StatusDTO> getStatus();
}
