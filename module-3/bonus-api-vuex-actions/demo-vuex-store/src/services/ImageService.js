
class ImageService
{

    nextImage()
    {
        const id = parseInt(Math.random() * 99)
        const folder = parseInt(Math.random() * 2) === 1 ? 'women' : 'men'

        return `https://randomuser.me/api/portraits/${folder}/${id}.jpg`
    }

}

export default new ImageService()
