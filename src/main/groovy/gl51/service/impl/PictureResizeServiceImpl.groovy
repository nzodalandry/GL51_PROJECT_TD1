package gl51.service.impl

import gl51.data.Image
import gl51.service.CloudUploadService
import gl51.service.ImageFiligraneService
import gl51.service.ImageResizingService
import gl51.service.ImageService

import gl51.service.UptdateDataBaseService

import javax.inject.Inject

class ImageResizingServiceImpl implements ImageResizingService {
    @Inject
    ImageService pictureService

    @Inject
    CloudUploadService cloudUploadService

    @Inject
    UptdateDataBaseService updateDataDaseService

    @Inject
    ImageFiligraneService pictureFiligraneService

    @Override
    Picture resize(Picture pictureSource, int dimensionX, int dimensionY) {
    }

    @Override
    Picture getResizeImage() {
        //Récupération de l'image
        Picture pictureSource=pictureService.fetchImage()

        //Redimensionnement de l'image au format 1024*1024
        Picture newImage=resize(pictureSource,1024,1024)

        //Création du thumbail
        Picture thumbnail=resize(pictureSource,50,50)

        //Ajout du filigrane
        Picture logo=pictureFiligraneServicee.addFiligrane(thumbnail)

        //Stockage dans le cloud
        cloudUploadService.uploadToCloud(newImage)
        cloudUploadService.uploadToCloud(logo)

        //Mise à jour de la base de données
        updateDataDaseService.updateDatabase(newImage.getX(),new_image.getY(),newImage.getName())

    }
}
