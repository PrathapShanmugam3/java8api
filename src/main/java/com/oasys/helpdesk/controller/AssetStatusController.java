package com.oasys.helpdesk.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.helpdesk.conf.exception.RecordNotFoundException;
import com.oasys.helpdesk.dto.AssetStatusRequestDTO;
import com.oasys.helpdesk.dto.DeviceAccessoriesStatusRequestDTO;
import com.oasys.helpdesk.service.AssetMapService;
import com.oasys.helpdesk.service.AssetStatusService;
import com.oasys.helpdesk.utility.ResponseHeaderUtility;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "HelpDeskData", description = "This controller contain all operations for Device Acessories Status")
@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
		@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
		@ApiResponse(code = 409, message = "Conflict occurred") })

@RequestMapping("/assetstatus")

public class AssetStatusController {
	
	@Autowired
	AssetStatusService assetStatusService;
	

	@PostMapping
    @ApiOperation(value = "This api is used to add Asset Type", notes = "Returns HTTP 200 if successful get the record")
	public ResponseEntity<Object> addAssetType(@Valid @RequestBody AssetStatusRequestDTO requestDTO) throws RecordNotFoundException, Exception {
		return new ResponseEntity<>(assetStatusService.add(requestDTO), ResponseHeaderUtility.HttpHeadersConfig(), HttpStatus.OK);
	}
	
	@PutMapping
    @ApiOperation(value = "This api is used to add Asset Type", notes = "Returns HTTP 200 if successful get the record")
	public ResponseEntity<Object> updateAssetType(@Valid @RequestBody AssetStatusRequestDTO requestDTO) throws RecordNotFoundException, Exception {
		return new ResponseEntity<>(assetStatusService.update(requestDTO), ResponseHeaderUtility.HttpHeadersConfig(), HttpStatus.OK);
	}
	@GetMapping
	@ApiOperation(value = "This api is to get all Asset Types", notes = "Returns HTTP 200 if successful get the record")
	public ResponseEntity<Object> getAll() {
		return new ResponseEntity<>(assetStatusService.getAll(), ResponseHeaderUtility.HttpHeadersConfig(), HttpStatus.OK);
	}
}