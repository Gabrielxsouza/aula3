package br.ifsp.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ifsp.contacts.model.Contact;

import java.util.List;


/**
 * Esta interface extende JpaRepository, que nos fornece métodos prontos 
 * para acessar e manipular dados no banco de dados. Basta especificar 
 * a classe de entidade (Contact) e o tipo da chave primária (Long).
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Podemos adicionar métodos personalizados se necessário.
    List<Contact> findByNomeContainingIgnoreCase(String nome);
}
