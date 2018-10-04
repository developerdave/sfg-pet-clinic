package services.map;

import model.Pet;
import org.springframework.stereotype.Service;
import services.CrudService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
}
