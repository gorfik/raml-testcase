package swaggerresponses;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/")
public class TestResource {
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@ApiOperation(value = "etwas", response = DxsoJobNumber.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "etwas", response = DxsoJobNumber.class) })
	public Response getCustomerBySntCode(DxsoJobNumberRequest request)
			throws Throwable {
		return null;
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@ApiOperation(value = "etwas")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "etwas", response = DxsoJobResponse.class) })
	public Response testLists(DxsoJob jobInfo){
		return null;
	}

	@DELETE
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@ApiOperation(value = "etwas")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "etwas", response = DxsoJobWithStringListResponse.class) })
	public Response testStringLists(DxsoJobWithStringList jobInfo){
		return null;
	}

}
