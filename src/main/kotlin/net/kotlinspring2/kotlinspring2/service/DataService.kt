package net.kotlinspring2.kotlinspring2.service

import net.kotlinspring2.kotlinspring2.model.Data
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


interface IPersonData{
   fun doThat() : ResponseEntity<String>
}

@RestController
@RequestMapping("/do")
class DataService : IPersonData {

     @GetMapping("/that")
   override fun doThat(): ResponseEntity<String> {
      return ResponseEntity.ok("OK")
   }
}
