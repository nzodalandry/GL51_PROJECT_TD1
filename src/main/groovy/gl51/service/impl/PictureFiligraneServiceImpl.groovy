package gl51.service.impl

import gl51.data.Image
import gl51.data.Picture
import gl51.service.ImageFiligraneService
import gl51.service.PictureFiligraneService

import javax.inject.Inject


class ImageFiligraneServiceImpl implements PictureFiligraneService {
@Inject
    PictureFiligraneService service
    @Override
    Picture add_filigrane(Picture image_source) {
        //Ajout du filigrane
        return null
    }

    @Override
    Picture applyFiligrane() {
        return null
    }
}
