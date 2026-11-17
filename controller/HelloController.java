@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<?> hello(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/bye")
    public ResponseEntity<?> bye(){
        return new ResponseEntity<>("bye World!", HttpStatus.OK);
    }
    
}